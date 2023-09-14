1) Run PostgresQL container

docker run -d --name ntn_product_manager -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=ntn_product_manager -p 5432:5432 postgres