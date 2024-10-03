package ru.vsu.cs.kodintsev.lab2;

public class WellOnArea {

    private Well well;
    private Area area;

    public WellOnArea(Well well,Area area) {
        this.well = well;
        this.area = area;
    }

    public Well getWell() {
        return well;
    }

    public void setWell(Well well) {
        this.well = well;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void drillDeeper(int additionalDepth) {
        well.setDepth((int) (well.getDepth() + additionalDepth));
        System.out.println("Скважина " + well.getWellName() + " на территории " + area.getName() + " была углублена на " + additionalDepth + " метров.");
    }

    public double calculateEfficiency() {
        double efficiency = (well.getReserves() * well.getDepth()) / area.getAreaSize();
        System.out.println("Эффективность скважины " + well.getWellName() + " на территории " + area.getName() + ": " + (int) efficiency + " условных единиц");
        return efficiency;
    }

    public void showInfo() {
        System.out.println("Скважина " + well.getWellName() + " расположена на территории " + area.getName() +
                " в стране " + area.getCountry());
    }
}
