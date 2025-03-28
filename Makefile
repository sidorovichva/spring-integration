build:
	docker-compose build
up:
	docker-compose up
down:
	docker-compose down
delete:
	docker-compose down --rmi all
start:
	docker-compose start
stop:
	docker-compose stop
restart:
	docker-compose restart
logs:
	docker-compose logs -f
list:
	docker-compose ps