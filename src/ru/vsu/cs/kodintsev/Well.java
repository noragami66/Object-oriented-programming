package ru.vsu.cs.kodintsev;

public class Well {

    private String wellName;
    private String reserves;

    public Well(String wellName, String reserves) {
        this.wellName = wellName;
        this.reserves = reserves;
    }

    public String getWellName() {
        return wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName;
    }

    public String getReserves() {
        return reserves;
    }

    public void setReserves(String reserves) {
        this.reserves = reserves;
    }


    public void showWellInfo() {
        System.out.println("Код месторождения: " + getWellName() + ", Запасы: " + getReserves());
    }
}
