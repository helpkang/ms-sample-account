docker
    build
        docker build --tag ms-sample-account .
        docker build --tag ms-sample-account:0.0.1 .
    run
        docker run -p 8081:8081 ms-sample-account --name="ms-sample-account" ms-sample-account:latest
    compose run
        docker-compose up -d
