package Creational.builder;

/**
 * Created by FrancescoXX
 */
public class QueryBuildDirector {

    /**
     * Creates a query bases on the from and the whre
     * @param from
     * @param where
     * @param builder to define end result of the query or the representation of the query
     * @return null by default, replace with what is needed
     */
    public Query buildQuery(String from, String where, QueryBuilder builder){
        builder.from(from);
        builder.where(where);
        return builder.getQuery();
    }
}

