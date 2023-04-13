package gof_patterns.abstract_factory;
/*Интерфейс с которым взаимодействует клиентский код,
*когда нужна какая-либо из веток - в properties прописывается нужная и все работает как надо.
*Для клиентского кода никаких изменений не требуется.
*Паттерн используется когда есть 2 дерева объектов и необходимость создавать их либо одним образом,
*либо другим образом.
 */
public interface AbstractFactory {
    Window createWindow();
    Button createButton();
}
