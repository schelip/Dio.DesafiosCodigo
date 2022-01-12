// Duas motos (X e Y) partem em uma mesma direção. A moto X sai com velocidade constante de 60 Km/h e a moto Y sai com velocidade constante de 90 Km/h.

// Em uma hora (60 minutos) a moto Y consegue se distanciar 30 quilômetros da moto X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

// O seu desafio é ler a distância (em Km) e calcular quanto tempo leva (em minutos) para a moto Y tomar essa distância da outra moto.

using System;

class Desafio
{
    static void Main()
    {
        int distancia = Int32.Parse(Console.ReadLine());
        int tempo = distancia * 2;
        Console.WriteLine(tempo + " minutos");
    }
}