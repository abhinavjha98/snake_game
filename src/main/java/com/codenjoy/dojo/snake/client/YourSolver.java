package com.codenjoy.dojo.snake.client;

import java.util.List;
import java.util.stream.Collectors;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2018 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.client.Solver;
import com.codenjoy.dojo.client.WebSocketRunner;
import com.codenjoy.dojo.services.Direction;
import com.codenjoy.dojo.services.Point;
import com.codenjoy.dojo.services.PointImpl;
import com.codenjoy.dojo.snake.model.BodyDirection;

/**
 * User: your name
 */
public class YourSolver implements Solver<Board> {
	
    public YourSolver() {
    }

    @Override
    public String get(Board board) {
    	Direction curr=board.getSnakeDirection();
    	List<Point>apples = board.getApples();
    	List<Point>parts = board.getSnake();
    	String now=curr.toString();
    	Point head=board.getHead();
    	if(head.getX()<=1&&head.getY()<=1&&curr==(Direction.LEFT)) 
    		now= Direction.UP.toString();
    	else if(head.getX()<=1&&head.getY()<=1&&curr==(Direction.DOWN))
    		now= Direction.RIGHT.toString();
    	else if(head.getX()<=1&&head.getY()>=13&&curr==(Direction.LEFT))
    		now= Direction.DOWN.toString();
    	else if(head.getX()<=1&&head.getY()>=13&&curr==(Direction.UP))
    		now= Direction.RIGHT.toString();
    	else if(head.getX()>=13&&head.getY()>=13&&curr==(Direction.UP))
    		now= Direction.LEFT.toString();
    	else if(head.getX()>=13&&head.getY()>=13&&curr==(Direction.RIGHT))
    		now= Direction.DOWN.toString();
    	else if(head.getX()>=13&&head.getY()<=1&&curr==(Direction.RIGHT))
    		now= Direction.UP.toString();
    	else if(head.getX()>=13&&head.getY()>=1&&curr==(Direction.DOWN))
    		now= Direction.LEFT.toString();
    	else if(head.getX()<=13&&head.getX()>=1&&head.getY()==1)
    		now= Direction.RIGHT.toString();
    	else if(head.getX()==13&&head.getY()<=13&&head.getY()>=1)
    		now=Direction.UP.toString();
    	else if(head.getX()<=13&&head.getX()>=1&&head.getY()==13)
    		now=Direction.LEFT.toString();
    	else if(head.getX()==1&&head.getY()<=13&&head.getY()>=1)
    		now=Direction.DOWN.toString();
    	Point app=apples.get(0);
    	if(app.getX()==head.getX()&&app.getY()>head.getY())
    		now= Direction.UP.toString();
    	else if(app.getY()==head.getY()&&app.getX()<head.getX()) 
    		now= Direction.LEFT.toString();
    	else if(app.getX()==head.getX()&&app.getY()<head.getY()) 
    		now= Direction.DOWN.toString();
    	else if(app.getY()==head.getY()&&app.getX()>head.getX()) 
    		now= Direction.RIGHT.toString();
    	
    	
    		
    	return now;
    	
    	//else if(head.getY()>=13)
    		
		
    	}

    public static void main(String[] args) {
        WebSocketRunner.runClient(
                // paste here board page url from browser after registration
                "http://172.16.4.254:8080/codenjoy-contest/board/player/k6c2a6rkb2hk77qwhz4r?code=7666199126958460819",
                new YourSolver(),
                new Board());
    }

}