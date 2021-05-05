package TugasPresentasi.templateMethode;

public abstract class BlockTemplate {
    public final void start() {
        System.out.println(getTitle());

        for (int i = 0; i < getHeight();i++ ){
            for (int j = 0; j < getWidht(); j++){
                System.out.print(getCharacter());
            }
            System.out.println("\n\r");
        }
        System.out.println(getEndTitle());
    }
    public abstract String getTitle();
    public abstract String getEndTitle();
    public abstract String getCharacter();
    public abstract Integer getHeight();
    public abstract Integer getWidht();
}

