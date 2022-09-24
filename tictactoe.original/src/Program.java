import javax.swing.*;
import java.io.Console;

public class Program
    {
        public char Box1 ;

        public char Box2 ;

        public char Box3 ;

        public char Box4 ;

        public char Box5 ;

        public char Box6 ;

        public char Box7 ;

        public char Box8 ;

        public char Box9 ;

        public boolean Error;

        public boolean IsWin;

        public boolean IsY ;

        public char WinPerson ;

        public void CheckWin()
        {
            // 123, 456, 789, 147, 258, 369, 159, 357
            if (Box1 == 'X' && Box2 == 'X' && Box3 == 'X')
            {
                IsWin = true;
                WinPerson = 'X';
                return;
            }

            if (Box4 == 'X' && Box5 == 'X' && Box6 == 'X')
            {
                IsWin = true;
                WinPerson = 'X';
                return;
            }

            if (Box7 == 'X' && Box8 == 'X' && Box9 == 'X')
            {
                IsWin = true;
                WinPerson = 'X';
                return;
            }

            if (Box1 == 'X' && Box4 == 'X' && Box7 == 'X')
            {
                IsWin = true;
                WinPerson = 'X';
                return;
            }

            if (Box2 == 'X' && Box5 == 'X' && Box8 == 'X')
            {
                IsWin = true;
                WinPerson = 'X';
                return;
            }

            if (Box3 == 'X' && Box6 == 'X' && Box9 == 'X')
            {
                IsWin = true;
                WinPerson = 'X';
                return;
            } // 159, 357

            if (Box1 == 'X' && Box5 == 'X' && Box9 == 'X')
            {
                IsWin = true;
                WinPerson = 'X';
                return;
            }

            if (Box3 == 'X' && Box5 == 'X' && Box7 == 'X')
            {
                IsWin = true;
                WinPerson = 'X';
                return;
            }

            if (Box1 == 'Y' && Box2 == 'Y' && Box3 == 'Y')
            {
                IsWin = true;
                WinPerson = 'Y';
                return;
            }

            if (Box4 == 'Y' && Box5 == 'Y' && Box6 == 'Y')
            {
                IsWin = true;
                WinPerson = 'Y';
                return;
            }

            if (Box7 == 'Y' && Box8 == 'Y' && Box9 == 'Y')
            {
                IsWin = true;
                WinPerson = 'Y';
                return;
            }

            if (Box1 == 'Y' && Box4 == 'Y' && Box7 == 'Y')
            {
                IsWin = true;
                WinPerson = 'Y';
                return;
            }

            if (Box2 == 'Y' && Box5 == 'Y' && Box8 == 'Y')
            {
                IsWin = true;
                WinPerson = 'Y';
                return;
            }

            if (Box3 == 'Y' && Box6 == 'Y' && Box9 == 'Y')
            {
                IsWin = true;
                WinPerson = 'Y';
                return;
            } // 159, 357

            if (Box1 == 'Y' && Box5 == 'Y' && Box9 == 'Y')
            {
                IsWin = true;
                WinPerson = 'Y';
                return;
            }

            if (Box3 == 'Y' && Box5 == 'Y' && Box7 == 'Y')
            {
                IsWin = true;
                WinPerson = 'Y';
            }
        }

        public void DisplayLoss()
        {
            System.out.println();
            System.out.println("No one won.");
            System.console().readLine();
            System.exit(1);
        }

        public void NotVacantError()
        {
            Error = true;
            System.out.println();
            System.out.println("Error: box not vacant!");
            System.out.println("Press any key to try again..");
            System.console().readLine();
        }

        public void WriteBoard()
        {
            System.out.println(String.format( " %s | %s | %s ", Box1, Box2, Box3));
            System.out.println(" --------- ");
            System.out.println(String.format(" %s | %s | %s ", Box4, Box5, Box6));
            System.out.println(" --------- ");
            System.out.println(String.format(" %s | %s | %s ", Box7, Box8, Box9));
        }

        public static void Main()
        {
            var moveCount = 0; // check loss
            char askMove; // display X or Y in question
            int selTemp;
            var prog = new Program();
            prog.Error = false;
            prog.Box1 = ' ';
            prog.Box2 = ' ';
            prog.Box3 = ' ';
            prog.Box4 = ' ';
            prog.Box5 = ' ';
            prog.Box6 = ' ';
            prog.Box7 = ' ';
            prog.Box8 = ' ';
            prog.Box9 = ' ';
            prog.IsY = true;
            System.out.println(" -- Tic Tac Toe -- ");

            while (!prog.IsWin)
            {
                if (moveCount == 9) prog.DisplayLoss();
                if (prog.IsY) // if is X
                    askMove = 'X';
                else
                    askMove = 'Y';
                prog.WriteBoard();
                System.out.println();
                selTemp = Integer.parseInt( JOptionPane.showInputDialog(String.format("What box do you want to place %c in? (1-9)", askMove)));
                switch (selTemp)
                {
                    case 1:
                        if (prog.Box1 == ' ')
                        {
                            prog.Box1 = askMove;
                            moveCount++;
                        }
                        else
                        {
                            prog.NotVacantError();
                        }

                        break;
                    case 2:
                        if (prog.Box2 == ' ')
                        {
                            prog.Box2 = askMove;
                            moveCount++;
                        }
                        else
                        {
                            prog.NotVacantError();
                        }

                        break;
                    case 3:
                        if (prog.Box3 == ' ')
                        {
                            prog.Box3 = askMove;
                            moveCount++;
                        }
                        else
                        {
                            prog.NotVacantError();
                        }

                        break;
                    case 4:
                        if (prog.Box4 == ' ')
                        {
                            prog.Box4 = askMove;
                            moveCount++;
                        }
                        else
                        {
                            prog.NotVacantError();
                        }

                        break;
                    case 5:
                        if (prog.Box5 == ' ')
                        {
                            prog.Box5 = askMove;
                            moveCount++;
                        }
                        else
                        {
                            prog.NotVacantError();
                        }

                        break;
                    case 6:
                        if (prog.Box6 == ' ')
                        {
                            prog.Box6 = askMove;
                            moveCount++;
                        }
                        else
                        {
                            prog.NotVacantError();
                        }

                        break;
                    case 7:
                        if (prog.Box7 == ' ')
                        {
                            prog.Box7 = askMove;
                            moveCount++;
                        }
                        else
                        {
                            prog.NotVacantError();
                        }

                        break;
                    case 8:
                        if (prog.Box8 == ' ')
                        {
                            prog.Box8 = askMove;
                            moveCount++;
                        }
                        else
                        {
                            prog.NotVacantError();
                        }

                        break;
                    case 9:
                        if (prog.Box9 == ' ')
                        {
                            prog.Box9 = askMove;
                            moveCount++;
                        }
                        else
                        {
                            prog.NotVacantError();
                        }

                        break;
                    default:
                        System.out.println("Wrong selection entered!");
                        System.out.println("Press any key to try again..");
                        System.console().readLine();
                        prog.Error = true;
                        break;
                }

                if (prog.Error)
                {
                    prog.CheckWin(); // if error, just check win
                    prog.Error = !prog.Error;
                }
                else
                {
                    prog.IsY = !prog.IsY; // flip boolean
                    prog.CheckWin();
                }
            }

            prog.WriteBoard();
            JOptionPane.showInputDialog(String.format("The winner is %c!", prog.WinPerson));

        }
    }
