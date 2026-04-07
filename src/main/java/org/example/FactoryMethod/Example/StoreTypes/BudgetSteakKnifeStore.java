package org.example.FactoryMethod.Example.StoreTypes;

import org.example.FactoryMethod.Example.Knife;
import org.example.FactoryMethod.Example.KnifeStore;
import org.example.FactoryMethod.Example.KnifeTypes.BudgetSteakKnife;

public class BudgetSteakKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(String type) {
        return new BudgetSteakKnife();
    }
}
