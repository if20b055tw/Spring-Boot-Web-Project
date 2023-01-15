docker run --name postgis-swkom --detach -e POSTGRES_USER=swkom_user -e POSTGRES_PASSWORD=mypasswd -e POSTGRES_DB=swkom_db -p 5432:5432 -v swkom_data:/var/lib/postgresql/data postgis/postgis
