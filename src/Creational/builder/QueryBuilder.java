package Creational.builder;

/**
 * Created by FrancescoXX
 */

/**
 * Lets the end user several methods to create query
 */
public interface QueryBuilder {

    void from(String from);

    void where(String where);

    Query getQuery();
}
