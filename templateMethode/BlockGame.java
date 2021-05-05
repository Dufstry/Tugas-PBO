package TugasPresentasi.templateMethode;

public class BlockGame extends BlockTemplate {

    @Override
    public String getTitle() {
        return "Block Game";
    }

    @Override
    public String getEndTitle() {
        return "Finish Block Game";
    }

    @Override
    public String getCharacter() {
        return "o";
    }

    @Override
    public Integer getHeight() {
        return 10;
    }

    @Override
    public Integer getWidht() {
        return 10;
    }
}

