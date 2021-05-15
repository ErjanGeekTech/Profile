package com.example.profile;

import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<LanguagesModel> list;

    public static List<LanguagesModel> getList(){
        list = new ArrayList<>();
        list.add(new LanguagesModel("Java", "Java is used for virtually all types of web applications and is the universal standard for the development and distribution of embedded and mobile applications, web content, and enterprise software. There are more than 9 million Java application developers worldwide that enable you to efficiently develop, deploy and use superior applications and services.", R.drawable.java));
        list.add(new LanguagesModel("Javacript", "JavaScript is a language that allows you to apply complex things to a web page - every time a web page has more than just static rendering - displaying periodically updated content, or interactive maps, or animating 2D / 3D graphics, or scrolling video in the player, etc. - you can be sure that most likely it was not without JavaScript. This is the third layer of the layered cake of standard web technologies, two of which (HTML and CSS) we covered in detail in other parts of the tutorial.", R.drawable.javascript));
        list.add(new LanguagesModel("C#", "C# is an object and component oriented programming language. C# provides language constructs to directly support this concept of work. This makes C# suitable for creating and using software components.", R.drawable.chh));
        list.add(new LanguagesModel("C++", "C++ - is a general-purpose compiled strongly typed programming language. Supports different programming paradigms: procedural, generalized, functional; most attention is paid to the support of object-oriented programming.", R.drawable.cpp));
        list.add(new LanguagesModel("Kotlin", "Kotlin is a statically typed programming language from JetBrains. Kotlin can be used to build mobile and web applications.Kotlin runs on top of a Java Virtual Machine (JVM) and compiles to bytecode when compiled. That is, as in the case of Java, we can run a Kotlin application wherever the JVM is installed. Although it is also possible to compile the code to JavaScript and run in a browser. And besides, it is possible to compile Kotlin code into native binaries that will work without any virtual machine. Thus, the range of platforms for which you can create applications in Kotlin is extremely wide - Windows, Linux, Mac OS, iOS, Android.", R.drawable.kotlin));
        list.add(new LanguagesModel("Python", "Python is an actively developing scripting language that is used to solve a large volume of the most diverse problems and tasks. Python is useful in creating computer and mobile applications, it is used in working with a large amount of information, in the development of websites and other various projects, it is used in machine learning. This programming language is used by large well-known corporations such as Spotify and Amazon (for example, to analyze data and create a recommendation algorithm), YouTube, Instagram and even Walt Disney. Thus, Python has found its place in various fields - with its help you can solve many problems of varying complexity.", R.drawable.python));
        return list;
    }
    public static LanguagesModel getModelByTitle(String title){
        LanguagesModel model = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equals(title)){
                model = list.get(i);
            }
        }
        return  model;
    }

    public  static List<LanguagesModel> getBiography(){
        list.add(new LanguagesModel("Cтив Джобс" , "Стивен Пол Джобс родился 24 февраля 1955 года. Его родителями были незарегистрированные в браке студенты: уроженец Сирии Абдулфаттах (Джон) Джандали и Джоан Шибле из католической семьи немецких эмигрантов. Джоан училась в магистратуре Висконсинского университета, а Джандали там же работал ассистентом преподавателя.", R.drawable.stiv));
        list.add(new LanguagesModel("Илон Маск", "Илон Маск родился в 1971 году в Претории, в Южно-Африканской Республике. Когда Илону было десять лет, его родители — канадская модель и южноафриканский инженер–электромеханик — развелись, дети (а у Маска были брат и сестра) стали жить в основном с отцом в Африке. Как утверждает Washington Post, отец Маска был человеком жестким и соответствующим образом обращался с детьми, например, заставлял их часами сидеть молча и слушать его нравоучения. Не лучше ситуация была и в школе. Одноклассники смеялись и издевались над замкнутым ботаником Илоном, а однажды избили его так сильно, что пришлось восстанавливать сломанный нос в больнице. Маск все больше замыкался в себе, его отдушиной стал компьютер. Он научился программировать на простеньком домашнем компьютере Commodore VIC-20 и даже разработал космическую аркаду Blastar, продав которую заработал первые $500. В нее до сих пор можно поиграть здесь.", R.drawable.ilon));
        list.add(new LanguagesModel("Марк Цукерберг", "Марк Цукерберг американский программист и интернет-предприниматель. Он является соучредителем Facebook и в настоящее время работает в качестве его председателя и главного исполнительного директора. Его чистая стоимость оценивается в $63,3 млрд по состоянию на май 2017 года, и он занимает пятое место в мировом рейтинге долларовых миллиардеров по версии Forbes.", R.drawable.mark));
        list.add(new LanguagesModel("Павел Дуров", "Место рождения. Образование. Павел Дуров родился в Ленинграде 10 октября 1984 года в интеллигентной семье. Отец - доктор филологических наук Валерий Семёнович Дуров, автор многих научных работ, с 1992 года возглавляет кафедру классической филологии филологического факультета СПбГУ. В первый класс школы пошёл, будучи в Турине, где его отец работал несколько лет. Вернувшись в родной город, Павел недолго учился в обычной школе и поступил в экспериментальные классы Академической гимназии (ныне Академические классы Медникова), в которой осуществляется углублённое изучение всех предметов, включая четыре иностранных языка. В 11 лет он впервые увлёкся программированием.", R.drawable.pavel));
        list.add(new LanguagesModel("Билл Гейтс", "Уильям Генри Гейтс III (англ. William Henry \"Bill\" Gates III) - американский предприниматель и общественный деятель, филантроп, один из создателей (совместно с Полом Алленом) и бывший крупнейший акционер компании Microsoft. Также является сопредседателем благотворительного Фонда Билла и Мелинды Гейтс, членом совета директоров Berkshire Hathaway, генеральным директоромCascade investment.", R.drawable.bil));
        return list;
    }

}
