# Basic Rent A Car Proje

Araç kiralama şirketi görevi gören basit bir Web Uygulaması. Kullanıcı mevcut arabaları görüntüleyebilir, yönetici araba ekleme-güncelleme işlemleri yapabilir, admin ise araç silme dahil bütün işlemleri yapabilir.

 <br />

## Kullanılan Teknolojiler


- Java 17
- Spring Boot v3.1.3
- Maven v3.8.2
- MySQL Community Server v8.0.32
- Spring Data JPA
- Spring Web MVC
- Spring Security with JWT
- Lombok
- Postman

 <br />
 
## Nasıl Çalıştırılır

1. İndir [MySQL](https://dev.mysql.com/downloads/installer/)
2. Komutu çalıştır `git clone https://github.com/sinaanuzun/basicRentACar`
3. Komutu çalıştır `cd car-rental-project`
4. Bilgileri düzenle *main/resources/application.yml*
```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/basicrentacar
    username: username
    password: password

```
5. Komutu çalıştır `mvn clean install`
6. Komutu çalıştır `mvn spring-boot:run`
7. Sunucu çalışıyor **localhost:8080**


#### Oturum açmak istediğiniz rolün kullanıcı adını ve şifresini girin:
|   Role  	| Username 	| Password 	|
|:-------:	|:--------:	|:--------:	|
|   User  	|   user   	|   user   	|
| Manager 	|  manager 	|  manager 	|
|  Admin  	|   admin  	|   admin  	|

 <b2>Rollerin Yetki Düzeyleri:</b2>                                                        <br />
USER: &nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;    Read                           <br />
MANAGER: &nbsp;                                             Read, Create, Update           <br />
ADMİN:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                Read, Create, Update, Delete   <br />

 <br />
 
##  Postman ile Rest API Çıktıları

GET

```
http://localhost:8080/api/car

```
![Adsıza](https://github.com/sinaanuzun/basicRentACar/assets/126362906/966fe5fe-6211-49b2-8567-9308d03fc35b)

 <br />

POST

```
http://localhost:8080/api/car

```
![adsızc](https://github.com/sinaanuzun/basicRentACar/assets/126362906/daf7d24f-38cf-4042-a6d5-ec016237fbf3)

 <br />
 
PUT

```
http://localhost:8080/api/car/1

```
![Adsızd](https://github.com/sinaanuzun/basicRentACar/assets/126362906/8c0f95f4-efa1-426d-83a9-2eb9f1703af5)

 <br />
 
DELETE

```
http://localhost:8080/api/car/2

```

![Adsıze](https://github.com/sinaanuzun/basicRentACar/assets/126362906/f7074640-a26b-4aae-a425-f040298639bf)


