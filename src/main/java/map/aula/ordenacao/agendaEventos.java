package main.java.map.aula.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class agendaEventos {

    private Map<LocalDate, evento> eventoMap;

    public agendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void addEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new evento(nome, atracao));
    }

    public void exibirEvento(){
        Map<LocalDate, evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obeterProximoEvento(){
       /* Set<LocalDate> dataSet = eventoMap.keySet();
        Collection<evento> values = eventoMap.values();*/
        //eventoMap.get();

        LocalDate dataAtual =  LocalDate.now();
        Map<LocalDate, evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, evento> entry : eventoTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: "+ entry.getValue() + "acontecera dia "+ entry.getKey());
                break;
            }
        }

    }

    public static void main(String[] args) {
        agendaEventos agenda__Eventos = new agendaEventos();

        agenda__Eventos.addEvento(LocalDate.of(2021, Month.JULY, 23), "BAHIA X VASCO", "Futebol Masculino");
        agenda__Eventos.addEvento(LocalDate.of(2023, Month.OCTOBER, 16), "BAHIA X Grêmio", "Futebol Feminino");
        agenda__Eventos.addEvento(LocalDate.of(2023, Month.OCTOBER, 9), "BAHIA X Goías", "Futebol Masculino");

        agenda__Eventos.exibirEvento();

        agenda__Eventos.obeterProximoEvento();
    }
}
