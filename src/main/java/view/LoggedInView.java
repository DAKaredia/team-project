package view;

import interface_adapter.logged_in.LoggedInState;
import interface_adapter.logged_in.LoggedInViewModel;
import interface_adapter.logged_in.LoggedInViewModelListener;
import interface_adapter.logout.LogoutController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The View for when the user is logged into the program.
 */
public class LoggedInView extends JPanel implements ActionListener, LoggedInViewModelListener {

    private final LoggedInViewModel loggedInViewModel;
    private LogoutController logoutController;

    private final JLabel username;

    private final JButton logOut;

    public LoggedInView(LoggedInViewModel loggedInViewModel) {
        this.loggedInViewModel = loggedInViewModel;
        this.loggedInViewModel.addListener(this);

        username = new JLabel(
                "Logged in as " + loggedInViewModel.getState().getUsername(),
                SwingConstants.CENTER);
        logOut = new JButton("Log Out");
        logOut.addActionListener(this);

        this.setLayout(new BorderLayout());

        final JPanel searchBar = new JPanel(new BorderLayout(8, 0));
        searchBar.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        searchBar.add(new JTextField(), BorderLayout.CENTER);

        final JPanel searchActions = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 0));
        searchActions.add(new JButton("Search"));
        searchActions.add(logOut);
        searchBar.add(searchActions, BorderLayout.EAST);
        this.add(searchBar, BorderLayout.NORTH);

        final JPanel emptyContent = new JPanel();
        emptyContent.setPreferredSize(new Dimension(800, 500));
        this.add(emptyContent, BorderLayout.CENTER);

        username.setBorder(BorderFactory.createEmptyBorder(0, 0, 12, 0));
        this.add(username, BorderLayout.SOUTH);
    }

    /**
     * React to a button click that results in evt.
     * @param evt the ActionEvent to react to
     */
    public void actionPerformed(ActionEvent evt) {
        // TODO: execute the logout use case through the Controller
        System.out.println("Click " + evt.getActionCommand());
    }

    public void setLogoutController(LogoutController logoutController) {
        // TODO: save the logout controller in the instance variable.
    }

    /**
     * The logged-in state was updated.
     */
    @Override
    public void stateChanged() {
        LoggedInState state = loggedInViewModel.getState();
        username.setText("Logged in as " + state.getUsername());
    }
}
