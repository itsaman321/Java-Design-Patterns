package com.trello.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Create a list of users
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Alice", "alice@example.com"));
        users.add(new User(2, "Bob", "bob@example.com"));

        // Create an ItemList (list of cards)
        List<ItemCard> cards = new ArrayList<>();
        cards.add(new ItemCard(1, "Card 1", "This is the first card"));
        cards.add(new ItemCard(2, "Card 2", "This is the second card"));

        // Create ItemLists
        ItemList list1 = new ItemList(1, cards, "To Do");
        ItemList list2 = new ItemList(2, new ArrayList<>(), "In Progress");

        // Create a Board
        List<ItemList> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        Board board = new Board("Project Board", lists, users);

        PMService pmService = new PMService(Arrays.asList(board)) ;

        while(true){
            String command = scanner.nextLine().trim().toLowerCase() ;
            switch(command){
                case "BOARD CREATE":
                    String boardName = scanner.nextLine();
                    Board newBoard = new Board(boardName);
                    pmService.addBoard(newBoard);
                    System.out.println("Created board: " + newBoard.getId());
                    break;

//                case "BOARD":
//                    String boardId = scanner.nextLine();
//                    String memberId = scanner.nextLine();
//                    System.out.println("Created board: " + newBoard.getId());
//                    break;

                case "create list":
                    System.out.print("Enter list name: ");
                    String listName = scanner.nextLine();
                    System.out.print("Enter list ID: ");
                    int listId = Integer.parseInt(scanner.nextLine());
                    ItemList newList = new ItemList(listId, new ArrayList<>(), listName);
                    board.getLists().add(newList);
                    System.out.println("List created: " + newList.getName());
                    break;

                case "add card":
                    System.out.print("Enter card name: ");
                    String cardName = scanner.nextLine();
                    System.out.print("Enter card description: ");
                    String cardDesc = scanner.nextLine();
                    System.out.print("Enter card ID: ");
                    int cardId = Integer.parseInt(scanner.nextLine());
                    ItemCard newCard = new ItemCard(cardId, cardName, cardDesc);
                    list1.addCard(newCard); // Add card to first list (you can modify as needed)
                    System.out.println("Card added: " + newCard.getName());
                    break;

                case "move card":
                    System.out.print("Enter card ID to move: ");
                    int moveCardId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter target list ID: ");
                    int targetListId = Integer.parseInt(scanner.nextLine());
                    board.moveCard(moveCardId, targetListId);
                    System.out.println("Card moved.");
                    break;

                case "assign user":
                    System.out.print("Enter card ID to assign user to: ");
                    int cardToAssignId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter user ID to assign: ");
                    int userId = Integer.parseInt(scanner.nextLine());
                    User userToAssign = users.stream().filter(user -> user.getId() == userId).findFirst().orElse(null);
                    ItemCard cardToAssign = list1.getCardById(cardToAssignId);
                    if (userToAssign != null && cardToAssign != null) {
                        list1.assignMemberToCard(userToAssign, cardToAssign);
                        System.out.println("User assigned: " + userToAssign.getName() + " to " + cardToAssign.getName());
                    } else {
                        System.out.println("User or Card not found.");
                    }
                    break;

                case "SHOW BOARD":
                    pmService.showBoard(scanner.nextLine()) ;
                    break;

                case "SHOW":
                    pmService.showBoard() ;
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Unknown command.");
            }
        }


    }
}
