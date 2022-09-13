# Лекция Spring MVC

1. Как анотираме контролер класовете си?
@Controller за обикновен контролер и @RestController за рест контролери
2. Как използваме @RequestMapping анотацията?
Използваме я за да опишем каква заявка и към кой път очакваме заявка
3. Има ли разлики между @GetMapping и @RequestMapping с метод Get върху метод?
не
4. Как може да вземем POST параметър?
Има няколко начина да се вземат паремтри един от тях е чрез @RequestBody
5. Как предаваме обект съм Thymeleaf view?
Като го добавим в модела
6. Как може да вземем optional параметър?
като в @RequestParam добавим параметър required = false
7. Как може да зададем default стойност на параметър?
като в @RequestParam добавим параметър defaultValue = <default стойност>
8. Каква разликата между Path variable и Query parameter?
Path variable е пътя на урл-а, а query parameter е параметър в урл-а