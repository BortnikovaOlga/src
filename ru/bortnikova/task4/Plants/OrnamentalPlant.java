package ru.bortnikova.task4.Plants;
// здесь модель декоративного кустарника
public class OrnamentalPlant extends Plant {
    private int startFlowering; // сроки цветения
    private boolean cut; // годность для целей флористики

    public OrnamentalPlant(String name, int width, int sun, int start, boolean cut) {
        super(name, width);
        super.setSunLighting(sun); // декоративные растения имеют разные требования к освещению (солнцелюбивые, тенелюбивые)
        this.startFlowering = start;
        this.cut = cut;
    }

    public void setStartFlowering(int startFlowering) { // установить примерный срок цветения
        this.startFlowering = startFlowering;
    }

    public int getStartFlowering() {
        return startFlowering;
    }

    public void setCut(boolean cut) {//установить признак использования для срезки (в букеты, флористические композиции)
        this.cut = cut;
    }

    public boolean isCut() {
        return this.cut;
    }
}
