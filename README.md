Por fin terminado :')

the request:

    curl --location 'https://flewoiz100.execute-api.us-east-2.amazonaws.com/prod/fibonacci' \
    --header 'Content-Type: application/json' \
    --data '{"index":6}'


apidoc.json => It is the definition of the endpoints, http codes and templates to map requests and responses

lambdas.yml => It is a SAM definition of the lambdas that were deployed

A lambda is created to save costs and not have the service active 24/7 and an apiGateway is configured so that it can map the requests, responses and errors to and from the lambda
In the future you can create your own proxy like nginx to have a central repository with the definitions of paths and http codes
You could also migrate the main logic to a microservice and configure its deployment file

It is created with the micronaut framework because it is widely used or has modules to create lambda functions
Coldstart could be improved by separating modules to the AWS layers and also eliminating unnecessary modules after compilation like lombok

The use of a pojo as input or output could also be improved in the future and better use APIGatewayProxyRequestEvent and APIGatewayProxyResponseEvent
to directly obtain headers, query params and others in the lambda, without needing to transform the data in the apigateway