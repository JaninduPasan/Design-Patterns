package org.example.FactoryMethod.StoreTypes;

import org.example.FactoryMethod.Knife;
import org.example.FactoryMethod.KnifeStore;
import org.example.FactoryMethod.KnifeTypes.BudgetChefsKnife;

public class BudgetChefsKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(String type) {
        return new BudgetChefsKnife();
    }
}
