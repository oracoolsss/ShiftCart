как пользоваться:
всего три позиции: apples, pens, 1 kg of sugar
в адресной строке браузера http://localhost:8080/cart
далее
/info - показать информацию о корзине
пример вывода:
Item / Price / Count / Total price of items: {apples / 10 rub / 20 / 200} {pens / 20 rub / 15 / 300}
{1 kg of sugar / 30 rub / 3 / 90} Total cost: 590 rub

/add/{item}/{count} - добавить в корзину {count} штук {item}. Если такой позиции нет, будет выведено position not found,
иначе - items added
пример: http://localhost:8080/cart/add/apples/34

/remove/{item}/{count} - убрать из корзины {count} штук {item}. Если такой позиции нет, будет выведено position not found,
иначе - items removed
пример: http://localhost:8080/cart/remove/apples/34

/remove/{item} - убрать из корзины {count} все {item}
пример: http://localhost:8080/cart/remove/1 kg of sugar