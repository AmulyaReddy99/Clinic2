import React, { Component } from 'react';
import Sidebar from "react-sidebar";

class CustomSidebar extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            sidebarOpen: true
        };
        this.onSetSidebarOpen = this.onSetSidebarOpen.bind(this);
    }
    onSetSidebarOpen(open) {
        this.setState({ sidebarOpen: open });
    }
    render() {
        return (
          <Sidebar
            sidebar={
                <div className="sidebar">
                    <p>Details</p>
                    <p>Stats</p>
                    <p>Messages</p>
                </div>
            }
            open={this.state.sidebarOpen}
            onSetOpen={this.onSetSidebarOpen}
            styles={{   
                sidebar:{ 
                    background: "white", 
                    width:"100%",  
                    display: 'flex'
                },
            }}
          >
            <button onClick={() => this.onSetSidebarOpen(true)}>
              Open sidebar
            </button>
          </Sidebar>
        );
    }
}

export default CustomSidebar;