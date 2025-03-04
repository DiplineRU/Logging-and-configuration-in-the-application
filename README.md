ru text
# Условия домашки
> На связи домашнее задание урока 4.4 Логирование и конфигурирование в приложении.В этом уроке мы поработаем с логированием и конфигурациями.

Цель сегодняшней домашней работы - добавить логирование в проект. А также создать несколько конфигурационных файлов для разных профилей.

## Шаг 1

Добавить в каждый метод сервиса сообщение. Сообщение должно говорить о том, что был вызван метод с определенным названием.

### пример
> Например, если вы вызываете метод createStudent, то производить вызов следующего кода:
> logger.info("Was invoked method for create student");
> Если у вас в коде есть исключения, то перед вызовом их стоит записать информацию в лог, используя необходимый уровень логирования. Например:
> logger.error("There is not student with id = " + id);
> Дополнительно постарайтесь добавить логи с уровнем логирования: debug и warning.


## Шаг 2

Создать контроллер InfoController. Добавить в него один эндпоинт GET /port.

### подсказка
> Этот эндпоинт будет возвращать одно значение - порт, на котором запущено приложение. В application.properties создать (если у вас его нет) свойство server.port = 8080. Это свойство указывает на порт, который будет использовать приложение. Именно это значение необходимо возвращать в эндпоинте GET /port


## Шаг 3

В прошлом задании мы использовали свойство server.port. В этом пункте необходимо создать два конфигурационных файла.

подсказка
> Каждый файл имеет уникальное значение для порта. Каждый конфигурационный файл будет относиться к определенному профилю. Таким образом, запуская приложение с различными профилями эндпоинт GET /port будет возвращать различные значения. Необходимо создать минимум два профиля. Для каждого профиля вам необходимо создать отдельный файл.

eng text
# Homework conditions
> The homework of lesson 4.4 Logging and configuring in the application is in touch.In this lesson, we will work with logging and configurations.

The purpose of today's homework is to add logging to the project. You can also create several configuration files for different profiles.

## Step 1

Add a message to each service method. The message should indicate that a method with a specific name has been called.

### example
> For example, if you call the createStudent method, then call the following code:
> logger.info ("There was an invoked method for create student");
> If you have exceptions in your code, then before calling them, you should write the information to the log using the required logging level. For example:
> logger.error("There is not student with id = " + id);
> Additionally, try to add logs with the logging level: debug and warning.


## Step 2

Create an InfoController. Add one GET/port endpoint to it.

### hint
> This endpoint will return a single value, the port on which the application is running. In application.properties, create (if you don't have one) the server.port = 8080 property. This property indicates the port that the application will use. This is the value that must be returned in the GET/port endpoint.


## Step 3

In a previous assignment, we used the server.port property. At this point, you need to create two configuration files.

hint
> Each file has a unique value for the port. Each configuration file will relate to a specific profile. Thus, when launching an application with different profiles, the GET/port endpoint will return different values. You must create at least two profiles. You will need to create a separate file for each profile.
