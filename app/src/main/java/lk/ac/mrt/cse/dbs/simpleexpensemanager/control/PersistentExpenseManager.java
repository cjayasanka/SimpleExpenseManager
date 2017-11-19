package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import android.content.Context;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.SQLAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.SQLTransactionDAO;

/**
 * Created by Chathura on 11/18/2017.
 */

public class PersistentExpenseManager extends ExpenseManager {

    Context context;

    public PersistentExpenseManager(Context tempContext){
        context = tempContext;
        setup();
    }
    @Override
    public void setup() {
        TransactionDAO PTransactionDAO = new SQLTransactionDAO(context);
        setTransactionsDAO(PTransactionDAO);

        AccountDAO PAccountDAO = new SQLAccountDAO(context);
        setAccountsDAO(PAccountDAO);
    }
}
