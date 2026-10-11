import sys
import os
import pandas as pd

def read_raw_data(input_folder):
    """
    Membaca semua path file data mentah dari folder input.
    """
    raw_files = []
    for root, dirs, files in os.walk(input_folder):
        for file in files:
            file_path = os.path.join(root, file)
            raw_files.append(file_path)
    return raw_files

def convert_to_dataset(raw_files):
    """
    Mengonversi file data mentah menjadi daftar DataFrame pandas.
    """
    datasets = []
    for file_path in raw_files:
        try:
            # Membaca data mentah (sesuaikan jika file berformat txt/log)
            df = pd.read_csv(file_path)
            datasets.append(df)
        except Exception as e:
            print(f"Gagal membaca file {file_path}: {e}")
    return datasets

def merge_dataset(datasets):
    """
    Menggabungkan seluruh DataFrame menjadi satu dataset tunggal.
    """
    if not datasets:
        return pd.DataFrame()
    return pd.concat(datasets, ignore_index=True)

def main():
    # Menangkap argumen <input_folder> dan <output_folder> dari CLI
    if len(sys.argv) < 3:
        print("Penggunaan: python3 accounting_dataset_generation.py <input_folder> <output_folder>")
        sys.exit(1)

    input_folder = sys.argv[1]
    output_folder = sys.argv[2]

    print(f"[1/3] Membaca data mentah dari: {input_folder}")
    raw_files = read_raw_data(input_folder)

    print(f"[2/3] Mengonversi data mentah ke dataset...")
    datasets = convert_to_dataset(raw_files)

    print(f"[3/3] Menggabungkan seluruh dataset...")
    final_df = merge_dataset(datasets)

    # Memastikan folder output ada dan menyimpan file CSV hasil akhir
    os.makedirs(output_folder, exist_ok=True)
    output_file = os.path.join(output_folder, "accounting_dataset.csv")
    final_df.to_csv(output_file, index=False)
    
    print(f"Selesai! Dataset berhasil disimpan ke: {output_file}")

if __name__ == "__main__":
    main()