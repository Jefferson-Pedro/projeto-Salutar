package br.com.isiflix.salutar.service.upload;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UploadServiceImpl implements IUploadService{
	

	@Override
	public String uploadFile(MultipartFile arquivo) {
		try {
			System.out.println("REALIZANDO UPLOAD DO ARQUIVO: " + arquivo.getOriginalFilename());
			String pastaDestino = "C:\\Users\\jefferson.silva\\Documents\\GitHub\\projeto-Salutar";
			String extensao = arquivo.getOriginalFilename().substring(arquivo.getOriginalFilename().lastIndexOf("."));
			String novoNome = UUID.randomUUID().toString() + extensao;
			
			Path path = Paths.get(pastaDestino + File.separator + novoNome);
			Files.copy(arquivo.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
			return novoNome;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
