package pokemon.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import pokemon.view.PokedexFrame;
import pokemon.model.*;

public class PokedexController
{
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame = new PokedexFrame(this);
	}
	
	private void addPokemon()
	{
		pokemonList.add(new Arceus(0, null));
		pokemonList.add(new Rayquaza(0, null));
		pokemonList.add(new Dialga(0, null));
		pokemonList.add(new Giratina(0, null));
	}
	
	public void start()
	{
		
	}
	
	public ArrayList<Pokemon> getPokemonList()
	{
		return pokemonList;
		
	}
	
	public boolean isInt(String text)
	{
		try
		{
			Integer.parseInt(text);
			return true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showInputDialog(appFrame, "You need to use double Type value.");
		}
		return false;
	}
	
	public void updatePokemon(int index, String [] data)
	{
		if (data.length == 5)
		{
			Pokemon current = pokemonList.get(index);
			current.setAttackPoints(Integer.parseInt(data[0]));
			current.setEnhancementModifier(Double.parseDouble(data[1]));
			current.setHealthPoints(Integer.parseInt(data[2]));
			current.setName(data[3]);
			current.setCanEvolve(Boolean.parseBoolean(data[4]));
		}
	}
	
	public String [] getPokeData(int index)
	{
		String [] data = new String [0];
		Pokemon current = pokemonList.get(index);
		data[0] = current.getAttackPoints() + "";
		data[1] = current.getEnhancementModifier() + "";
		data[2] = current.getHealthPoints() + "";
		data[3] = current.getName() + "";
		data[0] = current.isCanEvolve() + "";
		data[0] = current.getNumber() + "";
		return data;
	}
	
	public String[] buildPokedexText()
	{
		String [] names = new String [pokemonList.size()];
		
		for(int index = 0; index < pokemonList.size(); index++)
		{
			names[index] = pokemonList.get(index).getName();
		}
		return names;
	}

	public boolean isDouble(String text)
	{
		// TODO Auto-generated method stub
		return false;
	}

	public Object getFrame()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public void savePokedex()
	{
		try
		{
			String saveFile = null;
			FileOutputStream saveStream = new FileOutputStream(saveFile);
			ObjectOutputStream output = new ObjectOutputStream(saveStream);
			output.writeObject(pokemonList);
			output.close();
			saveStream.close();
		}
		catch(IOException error)
		{
			JOptionPane.showInputDialog(appFrame);
		}
	}
	
	private void loadPokedex()
	{
		try
		{
			ArrayList<Pokemon> saved = new ArrayList<Pokemon>();
			String saveFile = null;
			FileInputStream inputStream = new FileInputStream(saveFile);
			ObjectInputStream input = new ObjectInputStream(inputStream);
			saved = (ArrayList<Pokemon>) input.readObject();
			input.close();
			inputStream.close();
			pokemonList = saved;
		}
		catch(IOException error)
		{
			JOptionPane.showInputDialog(appFrame);
		}
		catch (ClassNotFoundException pokemonError)
		{
			JOptionPane.showInputDialog(appFrame);
		}
	}


	
	
	
	
	
	
	
	
	
	
	
}
