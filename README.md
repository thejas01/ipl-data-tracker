# ipl-data-tracker

This project aims to deliver a robust and scalable IPL information platform by leveraging the strengths of Spring Boot for building Microservices and MySQL for reliable data storage.

## Project Structure

The project is structured as follows:

- **player-service**: This microservice is responsible for managing player data. It includes endpoints for adding players, retrieving player details by ID, and fetching players by team.
- **stats-service**: This microservice handles statistical data. It includes endpoints for adding stats, retrieving stats by ID, and fetching stats by player or team.
- **team-service**: This microservice handles team-related data. It provides endpoints for adding teams, retrieving team details by ID, and fetching teams by player.
- **match-service**: This microservice manages match data. It includes endpoints for adding matches, retrieving match details by ID, and fetching matches by team or player.
- **api-gateway**: This microservice acts as the entry point for the entire system. It routes requests to the appropriate microservice based on the request path.
- **eureka-server**: This microservice acts as a service registry and discovery server. It helps in locating and managing microservices within the system.
- **config-server**: This microservice provides centralized configuration management. It allows for dynamic configuration updates across all microservices.
- **hystrix-dashboard**: This microservice provides a dashboard for monitoring and managing circuit breakers and other fault tolerance mechanisms.
- **zipkin-server**: This microservice provides distributed tracing capabilities. It helps in monitoring and debugging the flow of requests across microservices.
- **zuul-server**: This microservice acts as a reverse proxy and API gateway. It routes requests to the appropriate microservice based on the request path.
