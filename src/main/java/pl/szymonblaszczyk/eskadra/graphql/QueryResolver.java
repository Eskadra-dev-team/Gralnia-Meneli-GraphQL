package pl.szymonblaszczyk.eskadra.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

@Service
public class QueryResolver implements GraphQLQueryResolver {

    public String helloWorld() {
        return "Hello World!";
    }
}
