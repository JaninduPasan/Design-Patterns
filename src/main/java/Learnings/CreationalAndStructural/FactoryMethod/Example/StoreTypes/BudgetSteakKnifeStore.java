package Learnings.CreationalAndStructural.FactoryMethod.Example.StoreTypes;

import Learnings.CreationalAndStructural.FactoryMethod.Example.Knife;
import Learnings.CreationalAndStructural.FactoryMethod.Example.KnifeStore;
import Learnings.CreationalAndStructural.FactoryMethod.Example.KnifeTypes.BudgetSteakKnife;

public class BudgetSteakKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(String type) {
        return new BudgetSteakKnife();
    }
}
