package playlist;

public class LinkedPlayList {
	
	static class Node {
		private Song song;
		private Node next;
		
		public Node(Song song,Node next) {
			this.song = song;
			this.next = next;
		}
		
		public Song getSong() {
			return song;
		}
		
		public Node getNode() {
			return next;
		}

	}
	
	private Node head;
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public int size() {
		int size=0;
		Node current = head;
		while(current!=null) {
			size++;
			current = current.next;
		}
		return size;
	}
	
	public void insertAtHead(Song song) {
		Node node = new Node(song,null);//new head points to old head
		node.next = head;
		head = node;	
	}
	
	public boolean equals(Object o) {
		LinkedPlayList pl = (LinkedPlayList)o;
		if(pl.size() != size()) {return false;}
		Node current1 = pl.head;
		Node current2 = head;
		while(current1!=null) {
			if(!current1.song.equals(current2.song))
				return false;
			current1 = current1.next;
			current2 = current2.next;
		}
		return true;
	}
	
	public int hashCode() {
		int hc = 0;
		Node current = head;
		while(current!=null) {
			hc = hc + (current.getSong()).hashCode();
		}
		return hc;
	}
    
    public String toString() {
        String s = "";
        Node current=head;
        while(current!=null) {
            s = s + current.song;
            current = current.next;
            s = s+"->";
        }
        return s;
    }
	
	//****IMPLEMENT THIS*******//
	//Returns true if the LinkedPlayList contains a Node with Song s
	//Returns false otherwise
	public boolean contains(Song s) {
		Node current = head;
		while(current!=null) {
			if(current.song.equals(s))
				return true;
			current = current.next;
		}
		return false;
	}
	
	//****IMPLEMENT THIS*******//
	//Note that there is no tail instance variable
	//You should add a new Node containing Song, song 
	//to the end of the PlayList
	public void append(Song song) {
		Node node = new Node(song, null);
		if (head == null) {
			head = node;
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
	}
	
	//****IMPLEMENT THIS*******//
	//Returns that Node at the specified index in the List. 
	//Remember the first element in the list has an index of 0
	//Throws an indexOutOfBoundsException if the index is less than 0
	// or greater than or equal to the size of the list
	public Node get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index: " + index);
		}

		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}
	
	//****IMPLEMENT THIS*******//
	//Adds a new Node containing the Song song to the LinkedPlayList
	//at the current location. If I want to add a Song at the index 1,
	//the node at index 0 should be updated to point at the new Node and 
	//the remaining nodes should shift down one. This is very similar to
	//insertAt method we completed in class
	//If the index is invalid, throw an IndexOutOfBoundsException
	//Think about how to use the get method to implement the add method
	public void add(int loc,Song song) {
		if (loc < 0 || loc > size()) {
			throw new IndexOutOfBoundsException("Index: " + loc);
		}

		Node node = new Node(song, null);
		if (loc == 0) {
			node.next = head;
			head = node;
			return;
		}

		Node previous = get(loc - 1);
		node.next = previous.next;
		previous.next = node;
	}
	
	//****IMPLEMENT THIS*******//
	//remove the first node that contains the specified song and return true
	//if the list is empty throw an illegal argument exception
	//if the list doesn't contain the song, return false	
	public boolean removeOne(Song song) {
        if (head == null) {
            throw new IllegalArgumentException("Cannot remove a song from an empty playlist.");
        }

        Node previous = null;
        Node current = head;

        while (current != null) {
            if (current.song.equals(song)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
	}
	
	//****IMPLEMENT THIS*******//
	//remove the all the nodes that contain the specified song and return true;
	//if the list is empty throw an illegal argument exception
	//if the list doesn't contain the song, 
	//then print a useful message to the console
	public boolean removeAll(Song song) {
		if (head == null) {
            throw new IllegalArgumentException("Cannot remove songs from an empty playlist.");
        }

        boolean removed = false;

        // Remove matching nodes at the head.
        while (head != null && head.song.equals(song)) {
            head = head.next;
            removed = true;
        }

        // Remove matching nodes after the head.
        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.song.equals(song)) {
                current.next = current.next.next;
                removed = true;
            } else {
                current = current.next;
            }
        }

        if (!removed) {
            System.out.println("The playlist does not contain the specified song.");
        }
        return removed;
    }
	
    //****IMPLEMENT THIS*******//
    //Look for the node in the list that contains dataBefore
    //Create a new node that contains data and insert it immediately after the dataBefore node
    //For example if I call insertAfter(2,7) with the list [1,2,3]
    //the new list would be [1,2,7,3]
    //Returns true if the method successfully inserts the song and false otherwise
    public boolean insertAfter(Song prevSong, Song songToAdd) {
		Node current = head;
		while (current != null) {
			if (current.song.equals(prevSong)) {
				current.next = new Node(songToAdd, current.next);
				return true;
			}
			current = current.next;
		}
		return false;
	}
    }
