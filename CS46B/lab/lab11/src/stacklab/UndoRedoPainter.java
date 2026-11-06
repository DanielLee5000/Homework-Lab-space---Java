package stacklab;

import java.util.*;


public class UndoRedoPainter extends Painter
{
	public UndoRedoPainter()
	{
		setUndoButtonEnabled(false);
		setRedoButtonEnabled(false);
	}

	// Called when the user pushes the Undo button.
	void undo()
	{
		Stack<Circle> history = getHistory();
		Stack<Circle> undoHistory = getUndoHistory();
		setUndoButtonEnabled(!history.isEmpty());
		undoHistory.push(history.pop());
		repaint();

		setUndoButtonEnabled(!history.isEmpty());
		setRedoButtonEnabled(!undoHistory.isEmpty());
	}


	// Called when the user pushes the Redo button.
	void redo()
	{
		Stack<Circle> history = getHistory();
		Stack<Circle> undoHistory = getUndoHistory();
		setRedoButtonEnabled(!undoHistory.isEmpty());
		history.push(undoHistory.pop());
		repaint();

		setUndoButtonEnabled(!history.isEmpty());
		setRedoButtonEnabled(!undoHistory.isEmpty());
	}
	
	
	public static void main(String[] args)
	{
		new UndoRedoPainter().setVisible(true);
	}
}
