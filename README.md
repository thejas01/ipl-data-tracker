# Dockerized IPL Data Tracker Application

This document provides instructions for running the IPL Data Tracker application using Docker.

## Prerequisites

- Docker installed on your machine
- Docker Compose installed on your machine

## Services

The application consists of the following services:

1. **MySQL Database** - Stores all application data
2. **Discovery Server** - Eureka service registry for service discovery
3. **API Gateway** - Routes requests to appropriate microservices
4. **Player Service** - Manages player data
5. **Match Service** - Manages match data
6. **Scorecard Service** - Manages scorecard data
7. **Team Service** - Manages team data

## Building and Running the Application

### Option 1: Using Docker Compose

1. Navigate to the root directory of the project where the `docker-compose.yml` file is located.

2. Build and start all services:
   ```bash
   docker-compose up -d
   ```

3. To view logs:
   ```bash
   docker-compose logs -f
   ```

4. To stop all services:
   ```bash
   docker-compose down
   ```

### Option 2: Building and Running Individual Services

If you want to build and run services individually:

1. Build a service (e.g., discovery-server):
   ```bash
   cd discovery-server
   docker build -t discovery-server .
   ```

2. Run the service:
   ```bash
   docker run -p 8761:8761 discovery-server
   ```

## Accessing the Services

- **Eureka Dashboard**: http://localhost:8761
- **API Gateway**: http://localhost:8090
- **Player Service API**: http://localhost:8090/players
- **Match Service API**: http://localhost:8090/matches
- **Scorecard Service API**: http://localhost:8090/scorecards
- **Team Service API**: http://localhost:8090/teams

## Environment Variables

The following environment variables can be modified in the `docker-compose.yml` file:

- **Database Configuration**:
  - `MYSQL_ROOT_PASSWORD`: Database root password
  - `MYSQL_DATABASE`: Database name

- **Service Configuration**:
  - `SPRING_PROFILES_ACTIVE`: Set to "docker" to use Docker-specific configurations
  - `SPRING_DATASOURCE_URL`: JDBC URL for database connection
  - `SPRING_DATASOURCE_USERNAME`: Database username
  - `SPRING_DATASOURCE_PASSWORD`: Database password
  - `EUREKA_CLIENT_SERVICEURL_DEFAULTZONE`: URL for Eureka service discovery

## Troubleshooting

1. **Services not connecting to Eureka**:
   - Check if the discovery-server is running: `docker ps | grep discovery-server`
   - Verify network connectivity: `docker network inspect score_default`

2. **Database connection issues**:
   - Check if MySQL is running: `docker ps | grep mysql`
   - Verify database credentials in docker-compose.yml
   - Check service logs: `docker-compose logs mysql`

3. **Service not starting**:
   - Check service logs: `docker-compose logs service-name`
   - Verify that the Dockerfile is correctly configured
   - Ensure the ENTRYPOINT in the Dockerfile points to the correct main class
