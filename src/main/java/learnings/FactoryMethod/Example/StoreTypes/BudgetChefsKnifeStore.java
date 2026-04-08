package learnings.FactoryMethod.Example.StoreTypes;

import learnings.FactoryMethod.Example.Knife;
import learnings.FactoryMethod.Example.KnifeStore;
import learnings.FactoryMethod.Example.KnifeTypes.BudgetChefsKnife;

public class BudgetChefsKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(String type) {
        return new BudgetChefsKnife();
    }
}
