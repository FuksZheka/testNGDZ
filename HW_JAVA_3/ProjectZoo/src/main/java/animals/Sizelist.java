package animals;

public enum Sizelist {
    Small("little cage",1),
    Middle("middle cage", 2),
    Big("Large cage", 3),
    ExtralongKingSize("Extra big cage", 50);

    String SizeName;
    int size;

    Sizelist (String SizeName, int size){
        this.SizeName = SizeName;
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

