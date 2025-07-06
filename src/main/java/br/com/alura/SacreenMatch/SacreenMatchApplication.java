package br.com.alura.SacreenMatch;

import br.com.alura.SacreenMatch.model.getDataSeries;
import br.com.alura.SacreenMatch.service.ConsumeApi;
import br.com.alura.SacreenMatch.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SacreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SacreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumeApi consumeApi = new ConsumeApi();
		String address = "https://www.omdbapi.com/?t=naruto&apikey=e13bbb0e";
		String json = consumeApi.getApidata(address);

		System.out.println(json);

		ConvertData convert = new ConvertData();
		getDataSeries dataSeries = convert.obterdados(json, getDataSeries.class);

		System.out.println(dataSeries);
	}
}
