docker stop $(docker ps -aq)
docker container stop hospital-postgres
docker container rm hospital-postgres
docker container run --name hospital-postgres -d -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e DB_NAME=postgres -v /Users/ashutosh/docker/hospital/postgres:/var/lib/postgresql/data postgres:13.5