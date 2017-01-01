package Creational.builder;

/**
 * Created by FrancescoXX
 */

/**
 * Simple class
 * Creates 2 different query with the QueryBuildDirector and executes query.
 *
 */
public class Client {
    public static void main(String[] args) {
        QueryBuildDirector director = new QueryBuildDirector();
        String from = "client table";
        String where = "client name";

        /**
         * Example1: Start building using a sql query
         */
        QueryBuilder builder = new SqlQueryBuilder();

        /**
         * The Director builds stuff
         */
        Query query = director.buildQuery(from, where, builder);

        /**
         * Execute query. In general call a method from the SqlQuery class;
         */
        query.execute();


        /**
         * Switching builders
         * Now lets use same code to call a mongoDb query. Re-using builder instance
         */
        builder = new MongoDBQueryBuilder();

        /**
         * The Director builds stuff again
         */
        query = director.buildQuery(from, where,builder);

        /**
         * Execute query2
         */
        query.execute();



    }
}
