package org.example.FactoryMethod.Example.StoreTypes;

import org.example.FactoryMethod.Example.Knife;
import org.example.FactoryMethod.Example.KnifeStore;
import org.example.FactoryMethod.Example.KnifeTypes.BudgetChefsKnife;

public class BudgetChefsKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(String type) {
        return new BudgetChefsKnife();
    }
}
