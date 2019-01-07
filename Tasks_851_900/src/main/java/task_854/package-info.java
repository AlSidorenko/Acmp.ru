/**
 * Created on 06.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package task_854;

/*
    ЗАДАЧА №854
    Кондиционер

    В офисе, где работает программист Петр, установили кондиционер нового типа. Этот кондиционер отличается особой
простотой в управлении. У кондиционера есть всего лишь два управляемых параметра: желаемая температура и режим работы.

Кондиционер может работать в следующих четырех режимах:

    «freeze» — охлаждение. В этом режиме кондиционер может только уменьшать температуру.
                Если температура в комнате и так не больше желаемой, то он выключается.

    «heat» — нагрев. В этом режиме кондиционер может только увеличивать температуру.
              Если температура в комнате и так не меньше желаемой, то он выключается.

    «auto» — автоматический режим. В этом режиме кондиционер может как увеличивать,
              так и уменьшать температуру в комнате до желаемой.

    «fan» — вентиляция. В этом режиме кондиционер осуществляет только вентиляцию воздуха и не изменяет температуру в комнате.
             Кондиционер достаточно мощный, поэтому при настройке на правильный режим работы он за час доводит
             температуру в комнате до желаемой.

    Требуется написать программу, которая по заданной температуре в комнате troom, установленным на кондиционере
желаемой температуре tcond и режиму работы определяет температуру, которая установится в комнате через час.

    Входные данные
Первая строка входного файла INPUT.TXT содержит два целых числа troom, и tcond, разделенных ровно одним пробелом
 (–50 ≤ troom ≤ 50, –50 ≤ tcond ≤ 50).

    Вторая строка содержит одно слово, записанное строчными буквами английского алфавита — режим работы кондиционера,
как указано выше.

    Выходные данные
Выходной файл OUTPUT.TXT должен содержать одно целое число — температуру, которая установится в комнате через час.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	10 20
    heat	    20

2	10 20
    freeze	    10
 */