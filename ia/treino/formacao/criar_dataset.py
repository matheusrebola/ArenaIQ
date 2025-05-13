import pandas as pd
from torch.utils.data import Dataset
from PIL import Image
import torch
from torchvision import transforms

class FormacoesDataset(Dataset):
    def __init__(self, csv_path, transform=None):
        self.data = pd.read_csv(csv_path, sep=";")
        self.transform = transform

        # Criando mapeamento de classes para números
        self.classes = sorted(self.data["formacao"].unique())
        self.class_to_idx = {c: i for i, c in enumerate(self.classes)}

    def __len__(self):
        return len(self.data)

    def __getitem__(self, idx):
        img_path = self.data.iloc[idx]["imagem"]
        image = Image.open(img_path).convert("RGB")
        label_str = self.data.iloc[idx]["formacao"]
        label = self.class_to_idx[label_str]

        if self.transform:
            image = self.transform(image)

        return image, label
    
    transformacoes = transforms.Compose([
        transforms.Resize((224, 224)),
        transforms.ToTensor(),
        transforms.Normalize([0.485, 0.456, 0.406], [0.229, 0.224, 0.225])
        ])