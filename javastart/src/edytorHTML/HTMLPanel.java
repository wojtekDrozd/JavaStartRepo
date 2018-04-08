package edytorHTML;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class HTMLPanel extends JPanel {
	// pole do wpisywania kodu html
	private final JTextArea textArea = new JTextArea();
	// pole z wygenerowanym kodem
	private final JEditorPane editorPane = new JEditorPane();

	public HTMLPanel() {
		super();
		setLayout(new BorderLayout());
		createPanels();
	}

	private void createPanels() {
		// nie chcemy, aby mo¿na by³o edytowaæ
		editorPane.setEditable(false);
		// ustawiamy nasz editorPane, aby rozpoz
		editorPane.setContentType("text/html");
		// przycisk generowania podgl¹du
		JButton actionButton = new JButton("Podglad");
		actionButton.addActionListener(new ConvertListener());
		// panel pomocniczy do rozk³adu elementów
		JPanel helpPanel = new JPanel();
		helpPanel.setLayout(new GridLayout(1, 2));
		textArea.setBackground(Color.LIGHT_GRAY);
		// dodajemy komponenety tekstowe do pomocniczego panelu
		helpPanel.add(textArea);
		helpPanel.add(editorPane);
		this.add(helpPanel, BorderLayout.CENTER);
		this.add(actionButton, BorderLayout.SOUTH);
	}
	// dodac funkcjonalosc polegajaca na generowaniu podgladu na bierzaco

	class ConvertListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// zmiany wygl¹du wywo³ujemy w w¹tku
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					String text = textArea.getText();
					editorPane.setText(text);
					editorPane.revalidate();
				}
			});
		}
	}
}
