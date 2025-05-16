package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class LMmodel {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int Id;
private String ISBN;
private String Title;
private String Author;
private String Description;
private String Genere;
private int PublicationYear;
private int CopiesAvailable;
 private String Publisher;
 private String CoverImageUrl;
 
 
 public LMmodel() {
	 
 }
 public LMmodel(String isbn,String title,String author,String description,String genere,
		 int publicationYear,int copiesAvailable,String publisher,String coverImageUrl) {
	 this.ISBN=isbn;
	 this.Title=title;
	 this.Author=author;
	 this.Description=description;
	 this.Genere=genere;
	 this.PublicationYear=publicationYear;
	 this.CopiesAvailable=copiesAvailable;
	 this.Publisher=publisher;
	 this.CoverImageUrl=coverImageUrl;
	 
 }
 public LMmodel(int id,String isbn,String title,String author,String description,String genere,
		 int publicationYear,int copiesAvailable,String publisher,String coverImageUrl)
 {
	 this.Id=id;
	 this.ISBN=isbn;
	 this.Title=title;
	 this.Author=author;
	 this.Description=description;
	 this.Genere=genere;
	 this.PublicationYear=publicationYear;
	 this.CopiesAvailable=copiesAvailable;
	 this.Publisher=publisher;
	 this.CoverImageUrl=coverImageUrl;
 }

public int getId() {
	return Id;
}
public void setId(int id) {
this.Id = id;
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getGenere() {
	return Genere;
}
public void setGenere(String genere) {
	Genere = genere;
}
public int getPublicationYear() {
	return PublicationYear;
}
public void setPublicationYear(int publicationYear) {
	PublicationYear = publicationYear;
}
public int getCopiesAvailable() {
	return CopiesAvailable;
}
public void setCopiesAvailable(int copiesAvailable) {
	CopiesAvailable = copiesAvailable;
}
public String getPublisher() {
	return Publisher;
}
public void setPublisher(String publisher) {
	Publisher = publisher;
}
public String getCoverImageUrl() {
	return CoverImageUrl;
}
public void setCoverImageUrl(String coverImageUrl) {
	CoverImageUrl = coverImageUrl;
} 

@Override
public String toString() {
	return "LMmodel [Id=" + Id + ", ISBN=" + ISBN + ", Title=" + Title + ", Author=" + Author + ", Description="
			+ Description + ", Genere=" + Genere + ", PublicationYear=" + PublicationYear + ", CopiesAvailable="
			+ CopiesAvailable + ", Publisher=" + Publisher + ", CoverImageUrl=" + CoverImageUrl + "]";
}
}
