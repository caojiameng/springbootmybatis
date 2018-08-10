FROM registry.saas.hand-china.com/tools/mysql:5.6

COPY user.sql /mysql/user.sql


RUN cat /mysql/user.sql > /docker-entrypoint-initdb.d/dump.sql
