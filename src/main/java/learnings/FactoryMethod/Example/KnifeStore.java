package learnings.FactoryMethod.Example;

public abstract class KnifeStore {

    public Knife orderKnife(String knifeType) {

        Knife knife= createKnife(knifeType);

        knife.sharpen();
        knife.polish();
        knife.packaging();

        return knife;
    }

    public abstract Knife createKnife(String type);
}
