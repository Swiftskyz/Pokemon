package pokemon.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pokemon.controller.PokedexController;
import pokemon.view.PokedexPanel;

public class PanelTest extends JPanel
{
	private PokedexController app;
	private SpringLayout appLayout;
	
	private JButton changeButton;
	private JComboBox pokedexDropdown;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	
	private PokedexPanel testedPanel;
	
	public PokedexPanel(PokedexController app)
	{
		super();
		this.app = app;
		
		numberField = new JTextField("0");
		nameField = new JTextField("My Pokename");
		evolveField = new JTextField("false");
		attackField = new JTextField("0");
		enhancementField = new JTextField("0");
		healthField = new JTextField("0");
		
		numberLabel = new JLabel("This pokemon number is");
		healthLabel = new JLabel("This pokemon health is");
		evolveLabel = new JLabel("This pokemon can evolve");
		attackLabel = new JLabel("This pokemon attack level is");
		enhanceLabel = new JLabel("This pokemon enhancement level is");
		nameLabel = new JLabel("My name is");
		imageLabel = new JLabel("pokemon goes here");
		
		changeButton = new JButton("Click here to change the pokevalues");
		pokedexDropdown = new JComboBox(); // stub
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	@BeforeEach
	void setUp() throws Exception
	{
		testedPanel = new PokedexPanel(new PokedexController());
	}

	@AfterEach
	void tearDown() throws Exception
	{
		testedPanel = null;
	}

	@Test
	void testPokedexPanel()
	{
		assertNotNull(testedPanel.getComponents(), "Your panel must have components");
		assertTrue(testedPanel.getComponents().length > 10, "You need way more than 5 components in this app" );
		
	}
	
	@Test
	void testSetupPanel()
	{
		assertTrue(testedPanel.getLayout() instanceof SpringLayout, "You should be using a SpringLayout");
		int enabledCount = 0;
		int disabledCount = 0;
		int fieldCount = 0;
		for(Component examined : testedPanel.getComponents())
		{
			if (examined instanceof JTextField)
			{
				if (((JTextField)examined).isEnabled())
				{
					enabledCount++;
				}
				else
				{
					disabledCount++;
				}
				fieldCount++;
			}
			
		}
		assertTrue(fieldCount > 5, "You need a textfield for each of the data members");
		assertTrue(enabledCount > 4, "At least four of the textfields need to be editable");
		assertTrue(disabledCount == 1, "Exactly ONE of the textfields need to be non-editable");
	}
	
	@Test
	void testSetupListeners()
	{
		for(Component examined : testedPanel.getComponents())
		{
			if (examined instanceof JButton)
			{
				assertTrue( ((JButton)examined).getActionListeners().length == 1, "Your button must have a listener");
			}
			
			if (examined instanceof JComboBox)
			{
				assertTrue( ((JComboBox)examined).getItemListeners().length == 1, "Your JComboBox must have a listener");
			}
			
		}
	}

}
