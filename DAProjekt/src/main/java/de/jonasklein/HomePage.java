package de.jonasklein;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private String USR = "root";
	private String PWD = "Pa$$w0rd";
	private String CONSTRG = "jdbc:mysql://localhost:3306/DAProjekt";
	private String A = "SELECT Spalte FROM TestTabelle WHERE idTestTabelle = 1";
	private ResultSet rs;
	private String WRT;
	

	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) throws SQLException {
		super(parameters);

		try(Connection c = DriverManager.getConnection(CONSTRG, USR, PWD); PreparedStatement ps = c.prepareStatement(A)){
			rs = ps.executeQuery();
			rs.next();
			WRT = rs.getString(1);
		}
		
		add(new Label("version", WRT));

		// TODO Add your page's components here

		
    }
}
