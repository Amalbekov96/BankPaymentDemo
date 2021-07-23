# BankPaymentDemo

This project is similating a functionality of the internet payment system. It is a small functionality of the big system.
There are two Methods PAY and CHECK and each accordingly acts. The PAY request must be saved in the database and return all the information.
Where as the CHECK request checks the existance of the record and returns the corresponfing information in the xml format. 


## Project requirements

Можете пожалуйста выполнить следующее тестовое задание?

  *Требование

Приложение должно разработана Java 8+ (Spring) Должно быть использовано Hibernate БД должно работать на PostgreSQL Иметь логирование Для получения корректного ответа, нужно авторизоваться в запросе. Можете реализовать любой вид авторизации на Ваш выбор.
При получении не корректного тело запроса, выдавать корректный Exception в виде XML. 

  *Описание 
  
Написать приложение, которое принимает POST  запрос с JSON телом обрабатывает его и отдает ответ в виде XML; Приложение принимает запросы на порт 5656; Приложение должно уметь принимать запросы CHECK и PAY; При PAY запросе должна быть запись в БД, со всеми указанными параметрами;

  *Примеры запросов
  
1. CHECK

CHECK REQUEST:
{
  "request": {
    "id": 123123123,
    "supplier_id": 321321,
    "account": "999777111222",
    "amount": 100.12,
    "command": "check",
  "date": "2021-04-10 01:01:01"
  }
}

CHECK RESPONSE:

<?xml version="1.0" encoding="UTF-8" ?>
<response id="123123123" dts="2021-04-10 01:01:01">
  <p_id>111222</p_id>
  <status>0</status>
  <message>ACCOUNT EXISTS</message>
</response>

1. PAY

PAY REQUEST:
{
  "request": {
    "id": 123123123,
    "supplier_id": 321321,
    "account": "999777111222",
    "amount": 100.12,
    "command": "pay",
  "date": "2021-04-10 01:01:01"
  }
}

PAY RESPONSE:

<?xml version="1.0" encoding="UTF-8" ?>
<response id="123123123" dts="2021-04-10 01:01:01">
  <p_id>111222</p_id>
  <status>1</status>
  <message>PAYMENT CONFIRMED</message>
</response>
