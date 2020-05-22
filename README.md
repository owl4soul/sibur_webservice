# sibur_webservice
CounterpartyControlService

Задача по сброке проекта в отдельную папку (упаковываемую затем в .zip) 
для удобного запуска jar-ника со всеми нужными библиотеками решается так:

0. Общая структура папки приложения:

- ../sibur_apvka - корневая директория приложения
  - ../config - папка с настройками
    - application.properties - основные настройки spring-boot-приложения
    - logback.xml - настройки логгирования
  - ../jre (содержит java jre для запуска приложения с собственной версией java вместо системной)
  - ../lib (пока содержит только драйвер oracle - ojdbc8.jar)
  - ../logs (логи)
  - run.bat (запускатор)
  - sibur_apvka.jar (сам джарник приложения, собранный по команде mvn package и переименованный)

1. mvn clean compile 
Для очистки папки /target и перекомпиляции.По команде compile CXF-плагин 
сгенерирует java-классы и интерфейс сервиса из wsdl, находящейся в resources/schema/wsdl

2. mvn package
По данной команде будет сгенерирован jar-ник в папке /target.

2.1 Сгенерированный jar поместить в корневую директорию приложения, рядом с run.bat

2.2 Содержимое run.bat для запуска проекта:
@set PATH=.\jre\bin;%PATH%
@set JAVA_EXE=.\jre\bin\java
@%JAVA_EXE% -version
@start "sibur_ws" /B %JAVA_EXE% -Xms1g -Xmx1g -cp "./sibur_apvka.jar;./lib/*" org.springframework.boot.loader.JarLauncher

Где sibur_apvka.jar - имя джарника из пункта 2.1

3. Создать файл настроек приложения sibur_appvka/config/application.properties по аналогии с дефолтным:
{user.home}/IdeaProjects/sibur_webservice/src/main/resources/default/default_application.properties 
Задать свои настройки подключения к бд, порт запуска.

4. Создать файл настроек логгера sibur_appvka/config/logback.xml
Можно скопировать дефолтный из проекта:
{user.home}/IdeaProjects/sibur_webservice/src/main/resources/default/default_application.properties




